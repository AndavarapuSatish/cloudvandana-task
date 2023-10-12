function reverseWords(sentence) {
  const words = sentence.split(' ');

  const reversedWords = words.map(word => {
    const reversedWord = word.split('').reverse().join('');
    return reversedWord;
  });

  const reversedSentence = reversedWords.join(' ');

  return reversedSentence;
}

const inputSentence = "This is a sunny day";
const reversedSentence = reverseWords(inputSentence);
console.log(reversedSentence);
