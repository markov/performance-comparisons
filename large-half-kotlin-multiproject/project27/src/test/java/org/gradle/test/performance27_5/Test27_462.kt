package org.gradle.test.performance27_5

import org.junit.Assert.*

class Test27_462 {
    private val production = Production27_462("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}