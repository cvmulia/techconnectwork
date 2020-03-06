// A room should:
//
// have an area in square meters
// should start not painted
// should be able to be painted
const Paint = require ('./paint');
const Decorator = require (`./decorator`)



const Room = function (area){
  this.area = area;
  this.painted = false;

}

Room.prototype.bePainted = function(){
  this.painted = true;
}

module.exports = Room;
