package org.gradle.test.performance27_1

import org.junit.Assert.*

class Test27_89 {
    private val production = Production27_89("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}