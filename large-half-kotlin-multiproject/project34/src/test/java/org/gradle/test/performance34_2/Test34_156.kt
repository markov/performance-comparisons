package org.gradle.test.performance34_2

import org.junit.Assert.*

class Test34_156 {
    private val production = Production34_156("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}