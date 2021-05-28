#Current sol only passes 104/111 cases. too slow!
class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        
        GroupedAnagrams = []
        visited = []
        
        
        for i in range(len(strs)):
            if strs[i] in visited:
                continue
            aGroup = []
            aGroup.append(strs[i])
            print(aGroup)
            visited.append(strs[i])
            CheckHashTableOG = {}
            for letter in strs[i]:
                CheckHashTableOG[letter]=0
            for letter in strs[i]:
                CheckHashTableOG[letter]+=1
            visited_copy = copy.deepcopy(visited)
            for j in range(len(strs)):
                if len(strs[j])!=len(strs[i]):
                    continue
                flag = True
                if strs[j] in visited_copy:
                    visited_copy.remove(strs[j])
                    continue
                CheckHashTable = CheckHashTableOG.copy()
                for letter in strs[j]:
                    if(letter in CheckHashTable and CheckHashTable[letter]>=1):
                        CheckHashTable[letter] -=1
                    else:
                        flag = False
                        break
                
                for key in CheckHashTable:
                    if CheckHashTable[key]!=0:
                        flag = False
                
                if flag==False:
                    continue
                else:
                    aGroup.append(strs[j])
                    visited.append(strs[j])
            GroupedAnagrams.append(aGroup)
        
        return GroupedAnagrams
        