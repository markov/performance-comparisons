package org.gradle.test.performance18_1

import org.junit.Assert.*

class Test18_72 {
    private val production = Production18_72("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}