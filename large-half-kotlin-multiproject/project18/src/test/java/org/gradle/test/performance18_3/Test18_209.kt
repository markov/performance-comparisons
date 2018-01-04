package org.gradle.test.performance18_3

import org.junit.Assert.*

class Test18_209 {
    private val production = Production18_209("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}