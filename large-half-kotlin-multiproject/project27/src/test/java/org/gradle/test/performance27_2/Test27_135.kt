package org.gradle.test.performance27_2

import org.junit.Assert.*

class Test27_135 {
    private val production = Production27_135("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}