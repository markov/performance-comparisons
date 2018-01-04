package org.gradle.test.performance27_5

import org.junit.Assert.*

class Test27_490 {
    private val production = Production27_490("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}