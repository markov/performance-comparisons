package org.gradle.test.performance34_4

import org.junit.Assert.*

class Test34_302 {
    private val production = Production34_302("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}