package org.gradle.test.performance18_4

import org.junit.Assert.*

class Test18_362 {
    private val production = Production18_362("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}