function Descending(arr) {
  const n = arr.length;

  for (let i = 0; i < n - 1; i++) {
    let maxIndex = i;

    for (let j = i + 1; j < n; j++) {
      if (arr[j] > arr[maxIndex]) {
        maxIndex = j;
      }
    }

    if (maxIndex !== i) {
      [arr[i], arr[maxIndex]] = [arr[maxIndex], arr[i]]; 
    }
  }

  return arr;
}
const numbers = [5, 2, 9, 1, 5, 6];
const sortedNumbers = Descending(numbers);
console.log(sortedNumbers);