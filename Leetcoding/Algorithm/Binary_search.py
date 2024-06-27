data = [2,4,7,8,9,12,14,17,19,22,25,27,28,33,37]
target = 28

# Linear search O(N)
def linearSearch(data, target):
    for i in range(len(data)):
        if data[i] == target:
            return True
    return False

# Binary search O(log N)
# Iterative version
def binarySearchIterative(data, target):
    low = 0
    high = len(data) - 1

    while low <= high:
        mid = (low + high) // 2
        if target == data[mid]:
            return True
        elif target < data[mid]:
            high = mid -1
        else:
            low = mid + 1
    return False

# Recursive Binary search
def binarySearchRecursive(data, target, low, high):
    if low > high:
        return False
    else:
        mid = low + high // 2
        if target == data[mid]:
            return 
        elif target < data[mid]:
            return binarySearchRecursive(data,target, low, mid - 1)
        else:
            return binarySearchRecursive(data, target, mid + 1, high)
        
    


