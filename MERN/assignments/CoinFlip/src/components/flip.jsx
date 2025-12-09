function tossCoin() {
    return Math.random() > 0.5 ? "heads" : "tails";
}

function fiveHeads() {
    return new Promise( (resolve, reject) => {
        let headcount = 0;
        let attempts = 0 ;

        function flipCoin() {
            attempts ++;
            const result = tossCoin();


            if (result === "heads"){
                headcount ++;
            }
            else{
                headcount = 0;
            }

            if (headcount === 5){
                resolve(`It took ${attempts} tries to flip five "heads" in a row!`);
            }else if( attempts === 1000){
                reject(`It took ${attempts} tries to `)
            }
            else{
            setTimeout(flipCoin, 0);
            }
        }
        flipCoin();
    });
}


fiveHeads()
  .then(res => console.log(res))
  .catch(err => console.log(err));




