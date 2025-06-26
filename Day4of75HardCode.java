public List<Integer> nearestSmallerToLeft(int[] nums) {
    Stack<Integer> stack = new Stack<>();
    List<Integer> result = new ArrayList<>();

    for (int num : nums) {
        while (!stack.isEmpty() && stack.peek() >= num) {
            stack.pop();
        }

        if (stack.isEmpty()) {
            result.add(-1);
        } else {
            result.add(stack.peek());
        }

        stack.push(num);
    }

    return result;
}
