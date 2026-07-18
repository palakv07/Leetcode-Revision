class Solution:
    def reverseWords(self, s: str) -> str:
        l = list(map(str, s.split()))
        k = [x for x in reversed(l)]
        return " ".join(k)