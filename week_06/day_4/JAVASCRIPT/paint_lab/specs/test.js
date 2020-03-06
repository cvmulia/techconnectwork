const assert = require ('assert');


const Paint = require ('../paint');
const Room = require ('../room');
const Decorator = require (`../decorator`);


describe ("Room", function(){

  let room;
  beforeEach(function(){
    bedRoom = new Room (50);
  })


  it('Should have an area', function (){
      const actual = bedRoom.area;
      assert.strictEqual(actual, 50);
  });


  it ('Should start not painted', function (){
    const actual = bedRoom.painted;
    assert.strictEqual(actual, false);
  });


});
