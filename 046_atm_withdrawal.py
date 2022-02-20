

req_amt = 12

array = [2, 4, 1, 3, 1, 2, 5, 7]

arr_len = len(array)

left_dir_sums = []
for i in range(arr_len):
    left_dir_sums.append(sum(array[0:i+1]))
print(left_dir_sums)

right_dir_sums = []
for i in range(arr_len-1, -1, -1):
    right_dir_sums.append(sum(array[i::]))
print(right_dir_sums)




possible_solutions = []



from_left_count = 0

for ele in left_dir_sums:
    if ele < req_amt:
        from_left_count+=1
    elif ele == req_amt:
        from_left_count+=1
        possible_solutions.append(from_left_count)
        break
    else:
        from_left_count = -1
        break


from_right_count = 0

for ele in right_dir_sums:
    if ele < req_amt:
        from_right_count+=1
    elif ele == req_amt:
        from_right_count+=1
        possible_solutions.append(from_right_count)
        break
    else:
        from_right_count = -1
        break


from_left_with_right = 0

for i in range(len(left_dir_sums)):
    for j in range(len(right_dir_sums)):
        from_left_with_right = (i+1) + (j+1)
        if left_dir_sums[i] + right_dir_sums[j] == req_amt:
            possible_solutions.append(from_left_with_right)
            from_left_with_right = -1
            break
        elif left_dir_sums[i] + right_dir_sums[j] == req_amt:
            from_left_with_right = -1
            break
    if from_left_with_right == -1:
        break

from_right_with_left = 0

for i in range(len(right_dir_sums)):
    for j in range(len(left_dir_sums)):
        from_right_with_left = (i+1) + (j+1)
        if right_dir_sums[i] + left_dir_sums[j] == req_amt:
            possible_solutions.append(from_right_with_left)
            from_right_with_left = -1
            break
        elif right_dir_sums[i] + left_dir_sums[j] == req_amt:
            from_right_with_left = -1
            break
    if from_right_with_left == -1:
        break


print(possible_solutions)

