class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        n = len(digits)
        carry = 1
        for i in range(n-1,-1,-1):
            temp = (carry+digits[i])
            carry = temp//10
            digits[i] = temp%10
        
        if carry:
            digits.insert(0,1)
        
        return digits
