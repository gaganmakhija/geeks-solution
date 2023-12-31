<h2><a href="https://practice.geeksforgeeks.org/problems/shortest-common-supersequence0322/1?page=2&difficulty[]=1&category[]=Strings&sortBy=submissions">Shortest Common Supersequence</a></h2><h3>Difficulty Level : Medium</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given two&nbsp;strings X and Y&nbsp;of lengths&nbsp;m and n&nbsp;respectively, find the length of the smallest string which has both, X and Y as its sub-sequences.<br>
Note:&nbsp;X&nbsp;and Y can have both uppercase and lowercase letters.</span></p>

<p><span style="font-size:18px"><strong>Example 1</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>X = abcd, Y = xycd
<strong>Output: </strong>6<strong>
Explanation: </strong>Shortest Common Supersequence
would be abxycd which is of length 6 and
has both the strings as its subsequences.</span>
</pre>

<p><span style="font-size:18px"><strong>Example 2</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>X = efgh, Y = jghi
<strong>Output: </strong>6<strong>
Explanation: </strong>Shortest Common Supersequence
would be ejfghi which is of length 6 and
has both the strings as its subsequences.</span></pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
Complete&nbsp;<strong>shortestCommonSupersequence()</strong>&nbsp;function that takes X, Y, m, and n as arguments and&nbsp;returns&nbsp;the length of the required string.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(Length(X) * Length(Y)).<br>
<strong>Expected Auxiliary Space:&nbsp;</strong>O(Length(X) * Length(Y)).</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1&lt;= |X|, |Y| &lt;= 100</span></p>

<p>&nbsp;</p>
</div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Microsoft</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Strings</code>&nbsp;<code>Dynamic Programming</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Algorithms</code>&nbsp;