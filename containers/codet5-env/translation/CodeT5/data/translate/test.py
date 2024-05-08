import json
from transformers import RobertaTokenizer


tokenizer = RobertaTokenizer.from_pretrained("FacebookAI/roberta-base")
file1 = open("C:/Users/eraye/Desktop/codet5/containers/codet5-env/translation/CodeT5/data/translate/test.java-cs.txt.cs", 'r', encoding="utf8")
Lines = file1.readlines()
sum = 0
avg = 0
max = 0
count = 0
# Strips the newline character
for line in Lines:
    count += 1
    a = tokenizer(line)["input_ids"]
    size = len(a)
    sum += size
    if size > max:
        max = size

avg = sum/count
print(max)
print(avg)
