package org.gradle.test.performance27_2

import org.junit.Assert.*

class Test27_176 {
    private val production = Production27_176("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}