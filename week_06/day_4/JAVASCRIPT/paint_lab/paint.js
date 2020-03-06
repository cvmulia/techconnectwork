// A paint can should:
//
// have a number of litres of paint
// be able to check if it is empty
// be able to empty itself of paint


const Paint = function(volume){
  this.volume = volume
}

Paint.prototype.checkVolume = function(){
  if( this.volume === 0){
    console.log("This paint is empty");
  }
}

Paint.prototype.emptyPaint = function(){
  this.volume = 0;
}

module.exports = Paint;
