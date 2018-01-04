package org.gradle.test.performance34_1

import org.junit.Assert.*

class Test34_82 {
    private val production = Production34_82("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}