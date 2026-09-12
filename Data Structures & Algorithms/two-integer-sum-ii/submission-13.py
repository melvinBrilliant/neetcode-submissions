class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        l = 0
        r = len(numbers) - 1
        
        while l < r:
            # Gunakan nama variabel 'total' atau 'current_sum' 
            # untuk menghindari konflik dengan fungsi bawaan Python 'sum()'
            current_sum = numbers[l] + numbers[r]
            
            if current_sum == target:
                # Mengembalikan indeks yang ditambah 1 (1-indexed)
                return [l + 1, r + 1]
            elif current_sum < target:
                l += 1
            else:
                r -= 1
                
        # Kembalikan list kosong jika tidak ditemukan
        return []