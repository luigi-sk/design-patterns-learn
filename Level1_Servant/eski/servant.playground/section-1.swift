import Cocoa

protocol MoveableProtocol {
    var x: Int { get }
    var y: Int { get }
    func jumpTo(x: Int, y: Int)
}

class Mover {
    func slideTo(moveableObject: MoveableProtocol, x: Int, y: Int) {
        
        for tmpX in moveableObject.x...x {
            moveableObject.jumpTo(tmpX, y: moveableObject.y)
        }
        
        for tmpY in moveableObject.y...y {
            moveableObject.jumpTo(moveableObject.x, y: tmpY)
        }
    }
}

class Shape: MoveableProtocol {
    var x = 0
    var y = 0

    init() {}
    
    init(x: Int, y: Int) {
        self.x = x
        self.y = y
    }
    
    func jumpTo(x: Int, y: Int) {
        self.x = x
        self.y = y
        println("jumping... now I'am on position \(x) : \(y)")
    }
}

class Triangle: Shape {}
class Square: Shape {}
class Circle: Shape {}

var mover = Mover()
var t = Triangle()

mover.slideTo(t, x: 5, y: 5)

