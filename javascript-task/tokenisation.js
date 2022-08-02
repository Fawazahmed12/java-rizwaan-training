

function tokenization(inputString){
    let inputText = '';
    let output = [];
    for(let i=0;i<inputString.length;i++){
        if(inputString[i] == " "){
            output.push(inputText)
            inputText="";
        }else{
          inputText = inputText + inputString[i]
        }  
        if(inputString[i] != "" && i == inputString.length-1 ){
          output.push(inputText)
        }
    }
    return output;
}
const input = "Repeat var=m start=5 until=20"

const result = tokenization(input)
console.log(result)



