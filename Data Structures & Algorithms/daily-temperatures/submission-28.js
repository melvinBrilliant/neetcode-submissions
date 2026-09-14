class Solution {
    /**
     * @param {number[]} temperatures
     * @return {number[]}
     */
    dailyTemperatures(temperatures) {
        const n = temperatures.length;
        let res = new Array(n).fill(0);
        let stack = [];
        for (let i = 0; i < n; i++) {
            const isHigherTemp = () => !(stack.length === 0) &&
                temperatures[i] > temperatures[stack[stack.length - 1]];
            while (!(stack.length === 0) && temperatures[i] > temperatures[stack[stack.length - 1]]) {
                const prev = stack.pop();
                res[prev] = i - prev;
            }
            stack.push(i);
        }
        return res;
    }
}
