class RandomizedSet:

    def __init__(self):
        self.setTable = {}
        

    def insert(self, val: int) -> bool:
        if self.setTable.get(val, 0) == 0:
            self.setTable[val] = 1
            return True
        else:
            return False
    def remove(self, val: int) -> bool:
        if self.setTable.get(val, 0) == 0:
            return False
        else:
            self.setTable.pop(val)
            return True
    def getRandom(self) -> int:
        size = len(self.setTable.keys())
        idx = random.randint(0, size-1)
        return list(self.setTable.keys())[idx]