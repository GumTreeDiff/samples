curl -H "Authorization: token ${GITHUB_API_TOKEN}" -X POST \
-d "{\"body\": \"I generated a SimpleDiff here -> https://tranquil-earth-41184.herokuapp.com/diff?branch=${TRAVIS_BRANCH}\"}" \
"https://api.github.com/repos/${TRAVIS_REPO_SLUG}/issues/${TRAVIS_PULL_REQUEST}/comments"
