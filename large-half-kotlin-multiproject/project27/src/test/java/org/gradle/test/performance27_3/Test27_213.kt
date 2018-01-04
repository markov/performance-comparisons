package org.gradle.test.performance27_3

import org.junit.Assert.*

class Test27_213 {
    private val production = Production27_213("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}