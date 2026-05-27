class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<Integer, List<String>> anagramsAscii = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            int[] ascii = new int[26];

            for (char ch : chars) {
                ascii[ch - 'a']++;
            }


            List<String> stringList = anagramsAscii.get(Arrays.hashCode(ascii));

            if (stringList == null) {
                stringList = new ArrayList<>();
            }

            stringList.add(str);
            anagramsAscii.put(Arrays.hashCode(ascii), stringList);
        }

        System.out.println(anagramsAscii);

        for (Map.Entry<Integer, List<String>> entry : anagramsAscii.entrySet()) {
            result.add(entry.getValue());
        }

        return result; 
    }
}
