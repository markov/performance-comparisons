package org.gradle.test.performance34_2

import org.junit.Assert.*

class Test34_159 {
    private val production = Production34_159("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}