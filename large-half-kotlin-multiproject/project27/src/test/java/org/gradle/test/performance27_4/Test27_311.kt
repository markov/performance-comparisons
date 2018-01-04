package org.gradle.test.performance27_4

import org.junit.Assert.*

class Test27_311 {
    private val production = Production27_311("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}