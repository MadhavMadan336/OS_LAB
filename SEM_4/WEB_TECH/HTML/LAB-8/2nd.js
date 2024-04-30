const string = 'This is an example of a string with too many aababaaab';
const replacedString = string.replace(/a{2,}/g, 'b');
console.log(replacedString);
