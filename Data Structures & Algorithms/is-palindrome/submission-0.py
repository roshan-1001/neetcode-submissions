class Solution:
    def isPalindrome(self, s: str) -> bool:
        i = 0
        n = len(s)-1
        while i<n:
            while i<n and not self.isalphanum(s[i]):
                i+=1
            while i<n and not self.isalphanum(s[n]):
                n-=1
            if s[i].lower()!=s[n].lower():
                return False
            i+=1
            n-=1
        return True
    def isalphanum(self, c)->bool:
        return (ord('a')<=ord(c)<=ord('z') or ord('A')<=ord(c)<=ord('Z') or ord('0')<=ord(c)<=ord('9'))



