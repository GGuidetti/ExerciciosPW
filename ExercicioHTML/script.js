function minusculaParaMaiuscula(){
    var input = document.querySelector("#input");
    input.value = input.value.toUpperCase();
}
function maiusculaParaMinuscula(){
    var input = document.querySelector("#input");
    input.value = input.value.toLowerCase();
}
function primeiraLetraPalavra(){
    Object.defineProperty(String.prototype, 'capitalize', {
        value: function() {
          return this.charAt(0).toUpperCase() + this.slice(1);
        },
        enumerable: false
      });
    var input = document.querySelector("#input");
    input.value = capitalize(input.value);
}
function primeiraLetraFrase(){
    var input = document.querySelector("#input");
    var arrayValues = input.value.split(".");
    arrayValues = capitalize(arrayValues);
     var stringWithCommas = arrayValues;
     input.value = stringWithCommas
     input.value = input.value.replace(",",".")
}

function capitalize(value){
    const array = [];
    if (Array.isArray(value)){
        for (i=0; i<value.length; i++){
            array.push(value[i].charAt(0).toUpperCase() + value[i].slice(1));
        };
        return array;
    }
    else{
        return value.charAt(0).toUpperCase() + value.slice(1);;
    }
}
