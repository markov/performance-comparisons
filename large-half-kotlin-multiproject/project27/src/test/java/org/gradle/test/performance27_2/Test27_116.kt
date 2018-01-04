package org.gradle.test.performance27_2

import org.junit.Assert.*

class Test27_116 {
    private val production = Production27_116("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}