package org.gradle.test.performance15_2

import org.junit.Assert.*

class Test15_155 {
    private val production = Production15_155("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}