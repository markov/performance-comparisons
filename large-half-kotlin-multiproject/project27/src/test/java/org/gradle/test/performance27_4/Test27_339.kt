package org.gradle.test.performance27_4

import org.junit.Assert.*

class Test27_339 {
    private val production = Production27_339("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}