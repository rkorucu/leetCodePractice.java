package com.leetCode.ArrayQuestions.IntersectionOfTwoArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer>temp=new ArrayList<>();
      if(nums1.length> nums2.length){
          for (int i = 0; i < nums1.length ; i++) {
              for (int j = 0; j < nums2.length; j++) {
               if(nums2[i]==nums1[j])  {
                   temp.add(nums1[i]);
                   nums1[i]=-1;
                   break;
               }
              }

          }
      }
      else {
          for (int i = 0; i < nums1.length; i++) {
              for (int j = 0; j < nums2.length; j++) {
                  if (nums1[i] == nums2[j]) {
                      temp.add(nums1[i]);
                      nums2[j] = -1;
                      break;
                  }
              }
          }
      }
                  int ans[] = new int[temp.size()];
                  for (int k = 0; k < ans.length; k++) {
                      ans[k] = temp.get(k);
                  }
                  return ans;
              }
          }
