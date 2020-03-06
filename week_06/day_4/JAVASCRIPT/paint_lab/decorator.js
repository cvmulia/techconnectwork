// A decorator should:

// start with an empty paint stock
// be able to add a can of paint to paint stock
// be able to calculate total litres paint it has in stock
// be able to calculate whether is has enough paint to paint a room
// be able to paint room if has enough paint in stock

const Paint = require ('./paint');
const Room = require ('./room');

const Decorator = function(){
  this.paintStock = [];
}

Decorator.prototype.addPaint= function(paint){
  this.paintStock.push(paint)
}

// Decorator.prototype.calculate= function(area, volume){
//   if (this.Paint.volume === this.Room.area){
//     console.log("Enough paint to paint the room");
//   }else {console.log("Sorry, not enough paint!");}
// }
//
// Decorator.prototype.paintRoom = function(area, volume){
//   if (paintStock>0){
//     this.Paint.volume = paintStock * 3
//   }
//
//   if (this.Paint.volume>=this.Room.area){
//     const paintLeft = function(){
//       this.Paint.volume-this.Room.Area;
//       this.Room.paintedArea = this.Room.Area;
//     }
//     else{
//       this.Paint.volume =0;
//       this.Room.paintedArea=this.Paint.volume;
//       const areaLeft = this.Room.Area-this.Paint.volume;
//       console.log(`Not enough paint. Room area left to be painted is ${areaLeft}. Please buy more paint!`);
//     }
//   }
// }

module.exports = Decorator;
