package org.gradle.test.performance34_4

import org.junit.Assert.*

class Test34_363 {
    private val production = Production34_363("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}