function reverseWordsInSentence(sentence) {
    let words = [];
    let word = "";
    let reversedWords = [];

    for (let i = 0; i < sentence.length; i++) {
        if (sentence[i] !== ' ') {
            word += sentence[i];
        } else {
            words.push(word);
            word = "";
        }

        if (i === sentence.length - 1) {
            words.push(word);
        }
    }

    for (let i = 0; i < words.length; i++) {
        let reversedWord = reverseWord(words[i]);
        reversedWords.push(reversedWord);
    }

    let reversedSentence = reversedWords.join(' ');

    return reversedSentence;
}

function reverseWord(word) {
    let reversed = '';
    for (let i = word.length - 1; i >= 0; i--) {
        reversed += word[i];
    }
    return reversed;
}

// Example usage:
const inputSentence = "This is a sunny day";
const reversedSentence = reverseWordsInSentence(inputSentence);
console.log(reversedSentence);
