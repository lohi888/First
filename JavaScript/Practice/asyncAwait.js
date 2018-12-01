 async function check(){
    
//   return 10;

    await setTimeout(() => {
        console.log('i am actually inside async await...')
    },0);
    console.log('i am inside function...')
    return 10
}
console.log( check().then(x=> console.log(x)));
console.log('i am outside...')