class Node:
    def __init__(self):
        self.children = {}
        self.endOfWord = False

class PrefixTree:

    def __init__(self):
        self.root = Node()

    def insert(self, word: str) -> None:
            curr = self.root
            for ch in word:
                #i = ord(ch)-ord("a")
                if ch not in curr.children:
                    curr.children[ch] = Node()
                curr = curr.children[ch]
            curr.endOfWord = True

                    

    def search(self, word: str) -> bool:
        curr = self.root
        for ch in word:
            #i = ord(ch) - ord("a")
            if ch not in curr.children:
                return False
            curr = curr.children[ch]
        return curr.endOfWord

    def startsWith(self, prefix: str) -> bool:
        curr = self.root
        for ch in prefix:
            #i = ord(ch) - ord("a")
            if ch not in curr.children:
                return False
            curr = curr.children[ch]
        return True
        