package org.gradle.test.performance27_2

import org.junit.Assert.*

class Test27_199 {
    private val production = Production27_199("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}