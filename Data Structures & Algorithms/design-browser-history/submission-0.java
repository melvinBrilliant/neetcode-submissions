class BrowserHistory {
    class HistoryNode {
        String url;
        HistoryNode prev;
        HistoryNode next;

        HistoryNode() {
        }

        HistoryNode(String url) {
            this.url = url;
        }
    }

    HistoryNode homepageHistory;
    HistoryNode currentNode;

    public BrowserHistory(String homepage) {
        var homepageNode = new HistoryNode(homepage);
        this.homepageHistory = homepageNode;
        this.currentNode = homepageNode;
    }
    
    public void visit(String url) {
        var visitNode = new HistoryNode(url);
        currentNode.next = visitNode;
        visitNode.prev = currentNode;
        currentNode = visitNode;
    }
    
    public String back(int steps) {
        HistoryNode temp = currentNode;
        for (int i = steps; i > 0; i--) {
            if (temp == homepageHistory) {
                break;
            }
            temp = temp.prev;
        }
        currentNode = temp;
        return currentNode.url;
    }
    
    public String forward(int steps) {
        HistoryNode temp = currentNode;
        for (int i = steps; i > 0; i--) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        currentNode = temp;
        return currentNode.url;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */