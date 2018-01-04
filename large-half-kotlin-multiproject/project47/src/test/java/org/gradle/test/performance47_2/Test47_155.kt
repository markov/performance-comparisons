package org.gradle.test.performance47_2

import org.junit.Assert.*

class Test47_155 {
    private val production = Production47_155("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
