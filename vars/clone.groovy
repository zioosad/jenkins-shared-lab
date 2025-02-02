def call(String url, String branch) {
    echo "Cloning the code from ${url} on branch ${branch}..."
    git url: "${url}", branch: "${branch}"
    echo "Cloning completed successfully"
}
