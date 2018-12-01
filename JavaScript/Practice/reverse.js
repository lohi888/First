function isPalindrome(str){
    rts=str.split('').reverse().join('')
    //console.log(str==rts)
}
isPalindrome('level')


var x={};
//var y=Object.assign(x);
var y=x;
//console.log(x===y)

var a={}
    b={ke:'b'}
    c={ke:'c'}

a[b]=123;
a[c]=456;

//console.log(a[b]);




let obj = {
    a: 1,
    b: 2,
    c: {
        age: 30
    }
};

var objclone = Object.assign({},obj);
//console.log('objclone: ', objclone);

objclone.a = 45;
//console.log('After Change - obj: ', obj);           // 45 - This also changes
//console.log('After Change - objclone: ', objclone);



var b = 1;
function outer(){
   	var b = 2
    function inner(){
        b++;
        var b = 3;
        //console.log(b)
    }
    inner();
}
outer();

const names = ['John', 'Paul', 'George', 'Ringo', 'John'];

let xx = (names) => names.filter((v,i) => names.indexOf(v) !== i)
console.log(xx(names));