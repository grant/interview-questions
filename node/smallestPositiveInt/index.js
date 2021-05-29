function solution(A) {
  // write your code in JavaScript (Node.js 8.9.4)
  const s = new Set(A);
  for (let i = 1; i < A.length + 1; ++i) {
      if (!s.has(i)) return i;
  }
  return A.length + 1;
}

console.log(solution([1, 2, 3])); // 4
console.log(solution([-1, -3])); // 1
