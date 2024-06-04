def binaryNextNumber(self, s):
        # code here
        x=int(s,2)
        y=x+1
        res = bin(y)[2:]
        return res
