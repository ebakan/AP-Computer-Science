'''
Created on May 12, 2010

@author: eric.bakan12
'''
import sys
if __name__ == '__main__':
    ones=['zero','one','two','three','four','five','six','seven','eight','nine']
    teens=['ten','eleven','twelve','thirteen','fourteen','fifteen','sixteen','seventeen',
           'eighteen','nineteen']
    tens=['ten','twenty','thirty','forty','fifty','sixty','seventy','eighty','ninety']
    out=''
    for i in range(1,1001):
        temp=''
        string=str(i)
        if string=='1000': temp+="onethousand"
        elif len(string)==3:
            temp+=ones[int(string[0])]+"hundred"
            if string[1:]!='00':
                temp+="and"
        if len(string)>=2:
            if string[-2]=='1': temp+=teens[int(string[-1])]
            elif string[-2]!='0':
                temp+=tens[int(string[-2])-1]
                if string[-2]!='1' and string[-1]!='0':
                    temp+=ones[int(string[-1])]
            elif string[-1]!='0': temp+=ones[int(string[-1])]
        else: temp+=ones[i]
            
        out+=temp
        print "%d: %s" % (i,temp)
    sys.stdout.write(str(len(out)))